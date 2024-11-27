/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    //String key, String value
		Map<String, String> aluno = new HashMap<>();
		
		//Adicionando no HashMap
		aluno.put("Nome", "Jão");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3a");
		
		System.out.println(aluno);
		
		//Obter todas as keys da estrutura map
		System.out.println(aluno.keySet());
		
		//Obter todos os valores
		System.out.println(aluno.values());
		
		//Lista map de alunos
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		 //String key, String value
		Map<String, String> aluno2 = new HashMap<>();
		
		//Adicionando no HashMap
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Media", "8.9");
		aluno2.put("Turma", "3b");
		
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		//verificar se um map tem uma chave contains
		System.out.println(aluno.containsKey("Nome"));
		
	}
}


