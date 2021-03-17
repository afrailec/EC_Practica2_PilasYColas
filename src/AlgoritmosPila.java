public class AlgoritmosPila {

    public Pila crearPila() {
        Pila pila = new Pila();    //Se crea el objeto pila
        //Introducir los datos (cima) 48 24 19 4 3 2 1 0 (fondo)
        pila.apilar(0);
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(19);
        pila.apilar(24);
        pila.apilar(48);
        return pila;
    }

    public Pila copiaPilaRecursivo(Pila pilaOrigen) {
        //Completar
        Pila pilaCopia = new Pila();
        if(!pilaOrigen.vacia()){
            int elem = pilaOrigen.desapilar();
            pilaCopia = copiaPilaRecursivo(pilaOrigen);
            pilaOrigen.apilar(elem);
            pilaCopia.apilar(elem);
        }
        return pilaCopia;
    }

    public void sumaEnFondoPila(Pila pila) {
        sumaEnFondoPilaRecursivo(pila, 0);
    }

    public void sumaEnFondoPilaRecursivo(Pila pila, int suma){
        if(!pila.vacia()){
            int elem = pila.desapilar();
            suma = suma + elem;
            sumaEnFondoPilaRecursivo(pila, suma);
            pila.apilar(elem);
        } else {
            pila.apilar(suma);
        }
    }

    public void segunNumQuitar(Pila pilaOrigen) {
        //Completar
        int numElem = pilaOrigen.getNumElementos();
        if(numElem%2==0){
            if(!pilaOrigen.vacia()) {
                segunNumQuitarRecursivo(pilaOrigen);
            }

        }else{
            if(!pilaOrigen.vacia()){
                pilaOrigen.desapilar();
            }
        }
    }

    public void segunNumQuitarRecursivo(Pila pilaOrigen){
        if(pilaOrigen.getNumElementos()==1){
            pilaOrigen.desapilar();
        }else if(!pilaOrigen.vacia()){
            int elem = pilaOrigen.desapilar();
            segunNumQuitarRecursivo(pilaOrigen);
            pilaOrigen.apilar(elem);
        }
    }



    public void pruebaCopiaPilaRecursivo(Pila pila1) {
        System.out.println("\n---------------------Pruebas sobre copiaRPila---------------");
        Pila pilaCopia;
        System.out.println("Antes de copiar:");
        pila1.mostrar();
        pilaCopia = copiaPilaRecursivo(pila1);
        pilaCopia.apilar(2);
        System.out.println("Pila original:");
        pila1.mostrar();
        System.out.println("Pila copia:");
        pilaCopia.mostrar();
    }

    public void pruebaSumaEnFondo(Pila pila1) {
        System.out.println("\n---------------------Pruebas sobre sumaEnFondoPila---------------");
        pila1.mostrar();
        System.out.println("Al sumar primera vez sumaEnFondopila ");
        sumaEnFondoPila(pila1);
        System.out.println("Resultado obtenido:");
        pila1.mostrar();
        System.out.println("Al sumar segunda vez sumaEnFondopila ");
        sumaEnFondoPila(pila1);
        System.out.println("Resultado obtenido:");
        pila1.mostrar();
    }

    public void pruebaSegunNumQuitar (Pila pila1) {
        System.out.println("\n---------------------Pruebas sobre segunNumQuitar---------------");
        pila1.mostrar();
        System.out.println("Al lanzar primera vez segunNumQuitar ");
        segunNumQuitar(pila1);
        System.out.println("Pila original:");
        pila1.mostrar();
        System.out.println("Al lanzar segunda vez segunNumQuitar ");
        segunNumQuitar(pila1);
        System.out.println("Pila original:");
        pila1.mostrar();
    }
}

