package estruturaDeDados;

public class IteradorVetor<T extends Comparable<T>> implements Iterador<T> {

	private Vetor<T> container;
	private int current;
	
	public IteradorVetor(Vetor<T> vetor) {
		this.container = vetor;
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
		T data = container.get(current);
		current++;
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
		int IMenor;
		int Candidato;
		int IndiceC;

		for (IMenor = 0; IMenor < (current - 1); ++IMenor) {
			IndiceC = IMenor;
			T MenorC = container.get(IMenor);
			for (Candidato = IMenor + 1; Candidato < current; ++Candidato) {
				if (compareTo(container.get(IMenor), container.get(Candidato)) == 1) {
					IndiceC = Candidato;
					MenorC = container.get(Candidato);
				}
				swap(container.get(IMenor), container.get(IndiceC));
			}
		}
	}

	private void swap(T X, T Y) {
		T temp = X;
		X = Y;
		Y = temp;
	}

	private int compareTo(T primeiro, T proximo) {
		return (primeiro.compareTo(proximo));
	}
}