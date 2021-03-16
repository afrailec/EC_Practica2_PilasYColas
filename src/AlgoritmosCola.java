public class AlgoritmosCola {
    public Cola crearCola() {
        Cola cola = new Cola(); //Se crea el objeto cola
        //Introducir los datos (principio) 0 1 2 3 4 19 24 48 (final)
        //Completar
        cola.encolar(0);
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(19);
        cola.encolar(24);
        cola.encolar(48);
        return cola;
    }

    public Cola copiaCola(Cola cola) {
        //Completar
        int numElem = cola.getNumElementos();
        Cola colaCopia = new Cola();
        if(!cola.vacia()){
            for(int i = 0; i < numElem; i++){
                int elem =cola.desencolar();
                colaCopia.encolar(elem);
                cola.encolar(elem);
            }
        }
        return colaCopia;
    }

    public void mediaEnPrimeroCola(Cola cola) {
        //Completar
        int numElem = cola.getNumElementos();
        int media = 0;
        cola.encolar(media);
        for(int i = 0; i < numElem; i++){
            int elem =cola.desencolar();
            cola.encolar(elem);
            media = media + elem;
        }
    }

    public int numParesImpares(Cola cola, int valor) {
        //Completar
        return 0;
    }


    public void pruebaCopiaCola(Cola cola1) {
        System.out.println("\n---------------------Pruebas sobre copiaCola---------------");
        System.out.println("Antes de copiar:");
        cola1.mostrar();
        Cola colaCopia = copiaCola(cola1);
        colaCopia.encolar(2);
        System.out.println("Cola original:");
        cola1.mostrar();
        System.out.println("Cola copia:");
        colaCopia.mostrar();
    }

    public void pruebaMediaEnPrimeroCola(Cola cola1) {
        System.out.println("\n---------------------Pruebas sobre mediaEnPrimeroCola---------------");
        cola1.mostrar();
        mediaEnPrimeroCola(cola1);
        System.out.println("Después de ejecutar mediaEnPrimeroCola:");
        cola1.mostrar();
        System.out.println("La media de los elementos de la cola: " + cola1.desencolar());
        cola1.mostrar();
        Cola colaVacia = new Cola();
        mediaEnPrimeroCola(colaVacia);
        System.out.println("Al ejecutar mediaEnPrimeroCola de una cola vacía:");
        colaVacia.mostrar();
    }

    public void pruebaNumParesImpares(Cola cola1) {
        System.out.println("\n---------------------Pruebas sobre numeroElementosPI---------------");
        cola1.mostrar();
        System.out.println("Numeros impares en cola: " + numParesImpares(cola1, 1));
        System.out.println("Después de ejecutar Numeros impares en cola:");
        cola1.mostrar();
        System.out.println("Numeros pares en cola: " + numParesImpares(cola1, 2));
        System.out.println("Después de ejecutar Numeros pares en cola:");
        cola1.mostrar();
        System.out.println("Valor fuera de 1 y 2 de Numeros  en cola: " + numParesImpares(cola1, 4));
        System.out.println("Después de ejecutar Numeros pares en cola:");
        cola1.mostrar();
        Cola colaVacia = new Cola ();
        System.out.println("Numeros impares  en cola vacia: "+ numParesImpares(colaVacia,1));;
        System.out.println("Después de ejecutar Numeros impares  en cola vacia:");
        colaVacia.mostrar();
    }
}
