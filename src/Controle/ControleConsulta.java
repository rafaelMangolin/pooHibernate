package Controle;

import Modelo.Consulta;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Pessoa;
import Util.DataHoraUtil;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleConsulta extends ControleEntidade {

    public List<Consulta> buscarPorData(Date data) {
        List<Consulta> values = new ArrayList<>(repositorio.pegarValoresConsulta());
        List<Consulta> toReturn = new ArrayList<>();
        String dataPrin = DataHoraUtil.dateToString(data);
        for (Consulta c : values) {
            String dataAux = DataHoraUtil.dateToString(c.getData());
            if (dataPrin.equals(dataAux)) {
                toReturn.add(c);
            }
        }
        return toReturn;
    }

    public Consulta existeConsultaNestaHora(Date data, String hora, Medico m) {
        List<Consulta> values = new ArrayList<>(repositorio.pegarValoresConsulta());
        for (Consulta c : values) {
            if (c.getData().equals(data) && c.getHora().equals(hora) && c.getMedico().getNome().equals(m.getNome())) {
                return c;
            }
        }
        return null;
    }

    public Boolean podeGravarAConsulta(Date data, String hora, Medico m, String tipoConsulta) {
        List<Consulta> values = new ArrayList<>(repositorio.pegarValoresConsulta());
        Consulta nesteHorario = existeConsultaNestaHora(data, hora, m);
        Consulta noHorarioAnterior = existeConsultaNestaHora(data, DataHoraUtil.meiaHoraAntes(hora), m);
        Consulta noProximoHorario = existeConsultaNestaHora(data, DataHoraUtil.meiaHoraDepois(hora), m);
        if (tipoConsulta.equals("Retorno") && nesteHorario == null
                && (noHorarioAnterior == null || noHorarioAnterior.getTipo().equals("Retorno"))) {
            return true;
        } else if (tipoConsulta.equals("Primeira consulta") && nesteHorario == null
                && ((noHorarioAnterior == null && noProximoHorario == null) ||
                (noHorarioAnterior.getTipo().equals("Retorno")))) {
            return true;
        }
        return false;
    }

    public Boolean salvar(Consulta c) {
        if (repositorio.salvar(c)) {
            return true;
        }
        return false;
    }

    public List<Paciente> pegarPacientesConsultadosPorMes(Integer mes) {
        List<Consulta> values = new ArrayList<>(repositorio.pegarValoresConsulta());
        Set<Paciente> toReturn = new HashSet<>();
        String ano = DataHoraUtil.dateToString(Date.from(Instant.now())).split("/")[2];
        for (Consulta c : values) {
            String dataAux[] = DataHoraUtil.dateToString(c.getData()).split("/");
            String anoC = dataAux[2];
            String mesC = dataAux[1];
            if (ano.equals(anoC) && mes.equals(mesC)) {
                toReturn.add(c.getPaciente());
            }
        }
        return new ArrayList<>(toReturn);
    }

}
