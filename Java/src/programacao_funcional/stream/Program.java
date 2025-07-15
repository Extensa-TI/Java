package programacao_funcional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	
	/*
	 * Stream -> É uma sequência de elementosd advinda de uma fonte de dados que oferece suporte a "operações agregadas"
	 * Fonte de dados-> coleção, array, função de iteração, recurso E/S
	 * 
	 * Características-> Stream é uma solução para processar sequências de dados de forma:
	 * - Declarativa (iteração interna: escondida do programador)
	 * - Parellel-friendly (imutável-> thread safe)
	 * - Sem efeitos colaterais
	 * - Sob demanda (lazy evaluation)
	 * - Acesso sequencial (não há índices)
	 * - Single-use: só pode ser usada uma vez
	 * - Pipeline: operações em streams retornam novas streams. Então é possível criar uma cadeia de operações (fluxo de processamento).
	 * 
	 * Operações intermediárias e terminais:
	 * - O pipeline é composto por zero ou mais operações intermediárias e uma terminal
	 * 
	 * - Operações intermediárias->
	 * - Produz uma nova streams (encadeamento)
	 * - Só executa quando uma operação terminal é invocada (lazy evaluation)
	 * 
	 * -Operação terminal->
	 * - Produz um objeto não-stream(coleção ou outro)
	 * - Determina o fim do processamento da stream
	 * 
	 * Operações intermediárias->
	 * - filter
	 * - map
	 * - flatmap
	 * - peek
	 * - distinct
	 * - sorted
	 * - skip
	 * - limit(*) -> * short-circuit
	 * 
	 * Operações terminais->
	 * - forEach
	 * - forEachOrdered
	 * - toArray
	 * - reduce
	 * - collect
	 * - min
	 * - max
	 * - count
	 * - anyMatch(*)
	 * - allMatch(*)
	 * - noneMatch(*)
	 * - findFirst(*)
	 * - findAny(*)       (*) short-circuit
	 * 
	 * Como criar uma stream->
	 * Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection
	 * Outras formas de se criar uma stream incluem:
	 * - Stream.of
	 * - Stream.ofNullable
	 * - Stream.iterate
	 */

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		Stream<Integer> st1 = list.stream().map(x-> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x-> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L},p->new Long[] {p[1], p[0] + p[1]}).map(p->p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
