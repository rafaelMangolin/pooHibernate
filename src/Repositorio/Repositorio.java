package Repositorio;

import Modelo.Entidade;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repositorio <T extends Entidade>{
    private Map <Integer,T> repositorio;
    private static Integer index = 0;// indice unico para todas entidades


    public Repositorio() {
        this.repositorio = new HashMap<>();
    }
   
    
    public Boolean adicionar(T fonte){
//        if(fonte.setId(index)){
//            index++;
//        }
        this.repositorio.put(fonte.getId(),fonte);
        fonte = pegarPorId(fonte.getId());
        return fonte != null;
    }
    
    public T pegarPorId(Integer id){
        return this.repositorio.get(id);
    }
    
    public T pegarPorUsuario(String usuario){
        return this.repositorio.get(usuario);
    }
    
    public Collection<T> pegarRepositorio(){
        return this.repositorio.values();
    }

    public Boolean remover(Integer id) {
        return this.repositorio.remove(id) != null;
    }
}
