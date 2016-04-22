package estruturaDeDados;

public class IteradorVetor<T extends Comparable<T>> implements Iterador<T> {

	private Vetor<T> container;
	private int index;
	private int current;	
	
	public IteradorVetor(Vetor<T> vetor) {
		this.container = vetor;
		this.index = 0;
		this.current = 0;
	}
	/**
	 * Retorna verdadeiro se existem mais elementos na lista. 
	 * @return True se existem mais elementos, false caso
	 * contrario.
	 */
	@Override
	public boolean hasNext() {
		return current < container.getSize();
	}
	/**
	 * Retorna o proximo elemento da lista, se existir, null
	 * caso contrario.
	 * @return
	 */
	@Override
	public T next() {
		T data = container.get(index);
		index++;
		return data;
	}	
	/**
	 * Retorna verdadeiro se existe um elemento ante do
	 * elemento atual. Caso retorne verdadeiro, a chamada
	 * ao metodo "previous()" ira funcionar.
	 * @return True se existe um elemento antes do atual,
	 * false caso contrario.
	 */
	@Override
	public boolean hasPrevious() {
		return current > 0;
	}
	/**
	 * Volta uma posicao na estrutura e retorna o elemento
	 * anterior.
	 * @return O elemento anterior na estrutura de dados.
	 */
	@Override
	public T previous() {
		current--;
		T data = container.get(current);
		return data;
	}
	/**
	 * Insere um elemento imediatamente antes do elemento
	 * atual, caso esteja no final da lista, insere no fim
	 * da lista.
	 * @param dado O dado a ser inserido na estrutura.
	 */
	@Override
	public void insert(T dado) {
		container.insert(current, dado);
		current++;
	}
	
	/**
	 * Remove o dado atual apontado pelo iterador.
	 */
	@Override
	public void remove() {
		container.remove(current - 1);
	}

	public void selectionSort() {
		int indiceM;
		int escolha;
		int indiceC;

		for (indiceM = 0; indiceM < (current - 1); ++indiceM) {
			indiceC = indiceM;
			T menorC = container.get(indiceM);
			for (escolha = indiceM + 1; escolha < current; ++escolha) {
				if (compareTo(container.get(indiceM), container.get(escolha)) == 1) {
					indiceC = escolha;
					menorC = container.get(escolha);
				}
				swap(container.get(indiceM), container.get(indiceC));
			}
		}
	}

	private int compareTo(T primeiro, T proximo) {
		return (primeiro.compareTo(proximo));
	}
	
	private void swap(T a, T b) {
		T temp = a;
		a = b;
		b = temp;
	}
	
	public void ExibeVetor(){
		selectionSort();
        for(int i=0; i<container.getSize(); i++){
            System.out.println(container.get(i).toString());
        
        }
    }
}