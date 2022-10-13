import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    static List<Produto>produtoList=new ArrayList<>();
    Usuario usuario = new Usuario();
    Usuario useAdd = new Usuario();
    private final static String user = "Camilly";
    private final static String senha = "123456";

     void metodo(){
        perfil();
    }
        private static void perfil () {
            Scanner leia = new Scanner(System.in);
            System.out.println("Digite seu usuário: ");
            String user = leia.next();
            System.out.println("Digite sua senha: ");
            String senha = leia.next();
            Service s = new Service();
            String resposta = s.validacao(user, senha);
            System.out.println(resposta);
        }

   private String validacao(String u, String s){
        Scanner leia = new Scanner(System.in);
        if (u.equals(user) && s.equals(senha)){
            String nome = "Camilly";
            usuario.id = 1;
            usuario.nome = nome;
            System.out.println(""+usuario.nome);
            System.out.println("Para adicionar um cliente digite(1)"
            +"\n"+"Para remover um cliente digite(2)"+"\n"
            +"Para fazer compras digite(3) "+
                    "\n"+
                    "Para atualizar digite(4)"+
                    "\n"+"Para encerrar o programa digite(0): ");
            Integer escolha = leia.nextInt();
            if (escolha == 1){
                cliente();
            } else if (escolha == 2) {

            }
            return "Você está logado!";
        }else {
            return "Usuário ou senha inválido!";
        }
   }

    void cliente() {
        enquanto:
        while (true) {
            Scanner ad = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = ad.next();
            usuario.nome = nome;
            System.out.println("Digite seu CPF: ");
            String cpf = ad.next();
            usuario.cpf = cpf;
            System.out.println("Digite seu id: ");
            Integer id = ad.nextInt();
            usuario.id = id;
           // System.out.println("Digite um usuário: ");
          //  String user = ad.next();
          //  usuario.user = user;
            useAdd.usuarioList.add(usuario);
            System.out.println("Cliente " + usuario.nome + " adicionado com sucesso! ");
            System.out.println("Para adicionar um cliente digite(1)"
                    + "\n" + "Para remover um cliente digite(2)" + "\n"
                    + "Para fazer compras digite(3) "
                    + "\n"+
                    "Para atualizar digite(4)"
                    + "\n" + "Para encerrar o programa digite(0): ");
            Integer escolha = ad.nextInt();
            if (escolha == 1) {
                continue ;
            } else if (escolha == 2) {
                remover();
            }  else if (escolha==4) {
                atualiza();
            } else if (escolha==3) {
                compras();
            }else if (escolha == 0) {
                break enquanto;
            }

        }
    }

  void remover (){
         while (true) {
             Scanner leia = new Scanner(System.in);
             System.out.println("Digite o id do cliente: ");
             Integer id = leia.nextInt();
             for (int i = 0; i < useAdd.usuarioList.size(); i++) {
                 if (id.equals(useAdd.usuarioList.get(i).id)) {
                     useAdd.usuarioList.remove(i);
                 }
             }
             System.out.println("Para adicionar um cliente digite(1)"
                     + "\n" + "Para remover um cliente digite(2)" + "\n"
                     + "Para fazer compras digite(3) " + "\n"
                     + "\n"+
                     "Para atualizar digite(4)"+
                     "Para encerrar o programa digite(0): ");
             Integer escolha = leia.nextInt();
             if (escolha == 1) {
                 continue ;
             } else if (escolha == 2) {
                 remover();
             }  else if (escolha==4) {
                 atualiza();
             } else if (escolha==3) {
                 compras();
             }else if (escolha == 0) {
                 break;
             }
         }
  }
        void atualiza(){
         loop:
         while (true) {
             Scanner att = new Scanner(System.in);
             System.out.println("Digite o id do cliente que você deseja atualiazar: ");
             Integer clienteId = att.nextInt();
             for (int i = 0; i < useAdd.usuarioList.size(); i++) {
                 if (clienteId.equals(useAdd.usuarioList.get(i).id)) {
                     useAdd.usuarioList.get(i);
                     System.out.println("Para atualizar o nome digite(1): ");
                     Integer esc = att.nextInt();
                     if (esc == 1) {
                         System.out.println("Digite o nome: ");
                         String novoNome = att.next();
                         useAdd.nome = novoNome;
                         System.out.println("Cliente " + useAdd.nome + " atualizado com sucesso!");
                         System.out.println("CPF: " + useAdd.usuarioList.get(i).cpf + "\n" + "Id: " + useAdd.usuarioList.get(i).id);
                         System.out.println("Para adicionar um cliente digite(1)"
                                 + "\n" + "Para remover um cliente digite(2)" + "\n"
                                 + "Para fazer compras digite(3) " + "\n"+
                                 "Para atualizar digite(4)"+
                                 "\n" + "Para encerrar o programa digite(0): ");
                         Integer escolha = att.nextInt();
                         if (escolha == 1) {
                             continue loop;
                         } else if (escolha == 2) {
                             remover();
                         }  else if (escolha==4) {
                             atualiza();
                         } else if (escolha==3) {
                             compras();
                         }else if (escolha == 0) {
                             break loop;
                         }
                     }

                 }

             }

         }

     }
        void compras(){
         loop:
         while (true) {
             Produto pdrs = new Produto();
             Scanner prod = new Scanner(System.in);
             System.out.println("Produtos:(1) Camisa R$50.00" + "\n" + "(2) Calça R$100.00"
                     + "\n" + "(3) Tenis R$150.00: ");
             Integer id = prod.nextInt();
             pdrs.id = id;
             if (id == 1) {
                 pdrs.nomeProduto = "Camisa";
                 pdrs.precoIndividual = 50.00;
                 System.out.println("Digite a quantidade: ");
                 Integer quantidade = prod.nextInt();
                 pdrs.quantidade = quantidade;
                 pdrs.precoTotal = pdrs.precoIndividual * quantidade;
                 System.out.println("Produto: " + pdrs.nomeProduto + "\n" + "Total: " + pdrs.precoTotal);
             } else if (id == 2) {
                 pdrs.nomeProduto = "Calça";
                 pdrs.precoIndividual = 100.00;
                 System.out.println("Digite a quantidade: ");
                 Integer quantidade = prod.nextInt();
                 pdrs.quantidade = quantidade;
                 pdrs.precoTotal = pdrs.precoIndividual * quantidade;
                 System.out.println("Produto: " + pdrs.nomeProduto + "\n" + "Total: " + pdrs.precoTotal);
             } else if (id == 3) {
                 pdrs.nomeProduto = "Tenis";
                 pdrs.precoIndividual = 150.00;
                 System.out.println("Digite a quantidade: ");
                 Integer quantidade = prod.nextInt();
                 pdrs.quantidade = quantidade;
                 pdrs.precoTotal = pdrs.precoIndividual * quantidade;
                 produtoList.add(pdrs);
                 System.out.println("Produto: " + pdrs.nomeProduto + "\n" + "Total: " + pdrs.precoTotal);
             }
             System.out.println("Para adicionar mais um produto na sacola digite(1)" + "\n" + "Para encerrar o programa digite(0): ");
             Integer escolha = prod.nextInt();
             if (escolha == 1) {
                 continue;
             } else if (escolha ==0) {
                 break loop;
             }
             for (Produto p: produtoList){
                 System.out.println("Produto: "+p.nomeProduto+"\n"+"Total: "+p.precoTotal);
             }
         }
     }

    void mostrarLista(){
        if (useAdd.usuarioList.size()>0){
            for (Usuario c : useAdd.usuarioList){
                System.out.println("Lista completa: "+c.nome);
            }
            System.out.println("");
        }
    }
}
