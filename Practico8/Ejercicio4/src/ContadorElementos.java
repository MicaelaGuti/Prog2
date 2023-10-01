public class ContadorElementos implements AccionEjecutable {
        private int contador;
    
        public ContadorElementos() {
            this.contador = 0;
        }
    
        @Override
        public void ejecutarNodo(Nodo nodo) {
            if (nodo != null) {
                contador++;
            }
        }
    
        public int obtenerContador() {
            return contador;
        }
    
}
