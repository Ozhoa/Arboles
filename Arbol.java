public class Arbol {

    private Nodo raiz;

    public Arbol(){
        raiz=null;
    }
    private void insertar(Nodo actual,Computador cpu ){
        if(cpu.getCodigo()<actual.getCompu().getCodigo()){
            if(actual.getIzquierda()==null){
                actual.setIzquierda(new Nodo(cpu,null,null));
            }else{
                insertar(actual.getIzquierda(),cpu);
            }
        }else{
            if(actual.getDerecha()==null){
                actual.setDerecha(new Nodo(cpu,null,null));
            }else{
                insertar(actual.getDerecha(),cpu);
            }
        }
    }

    public void insertar(Computador cpu){
        if(raiz==null){
            raiz=new Nodo(cpu,null,null);
        }else{
            insertar(raiz,cpu);
        }
    }

    public String inOrden(Nodo actual){
        if(actual!=null){
            return  inOrden(actual.getIzquierda())+
                    actual.getCompu()+
                    inOrden(actual.getDerecha());
        }else {
            return "";
        }
    }

    public String inOrden(){
        if(raiz==null){
            return "Arbol sin elementos";
        }else{
            return inOrden(raiz);
        }
    }
}
