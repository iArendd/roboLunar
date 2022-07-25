import java.util.Scanner;

public class Robo {

    int carga;
    int descarga;
    int descargaRotaciona;
    int descargaFoto;

    String linha = "---------------------";

    void perguntar(){
    
        String movimento = " ";
    

        Scanner leitor = new Scanner(System.in);

        System.out.println("Para se mover, aperte 'W' para andar para frente ou 'S' para andar para trás:");

        movimento = leitor.nextLine();

        /* AÇÃO */

        if(movimento.contains("w") || movimento.contains("W")){

            System.out.println(linha);

            System.out.println("O robô deu um passo para frente");

            this.andou();

            System.out.println(linha); System.out.println();

        }else{

            if(movimento.contains("S") ||movimento.contains("s") ){

                System.out.println(linha);

                System.out.println("O robô deu um passo para trás");

                this.andou();
                System.out.println(linha); System.out.println();

            }else{

                System.out.println(linha);
                System.out.println("!! Comando inválido !!");
                System.out.println(linha);
                System.exit(1);
                    
                }

            }
    
        }

    void perguntarRotacao(){

        int rotaciona = 0;
    

        Scanner leitor = new Scanner(System.in);

        System.out.println("Para girar, escolha o grau que deseja rotacionar (90 / 180 / 270 / 360), caso não queira rotacionar, digite 0:");

        rotaciona = leitor.nextInt();

        /* AÇÃO */
        

        if(rotaciona == 0){

            System.out.println(linha); 
            System.out.println("O robô rotacionou: "+rotaciona+"°");

            System.out.println("Carga atual: "+this.carga);
            System.out.println(linha);

        }else{

            if(rotaciona == 90){

                System.out.println(linha); 
                System.out.println("O robô rotacionou: "+rotaciona+"°");

                this.girou();
                System.out.println(linha);

            }else{

                if(rotaciona == 180){

                    System.out.println(linha); 
                    System.out.println("O robô rotacionou: "+rotaciona+"°");

                    this.girou();
                    System.out.println(linha);

                }else{

                    if(rotaciona == 270){

                        System.out.println(linha); 
                        System.out.println("O robô rotacionou: "+rotaciona+"°");

                        this.girou();
                        System.out.println(linha);

                    }else{

                        if(rotaciona == 360){

                            System.out.println(linha); 
                            System.out.println("O robô rotacionou: "+rotaciona+"°");

                            this.girou();
                            System.out.println(linha);

                        }else{

                            System.out.println(linha);
                            System.out.println("!! Comando inválido !!");
                            System.out.println(linha);
                            System.exit(1);

                        }

                    }

                }
                
            }

        }

    }
    
    void perguntarFoto(){

        String acionarFoto = " ";
    

        Scanner leitor = new Scanner(System.in);

        System.out.println("Deseja tirar uma foto? Aperte 'f' para sim ou 'x' para não: ");

        acionarFoto = leitor.nextLine();


        if(acionarFoto.contains("f") || acionarFoto.contains("F")){

            System.out.println(linha);
            System.out.println("O rogô registrou uma foto");

            this.fotografou();

        }else{

            if(acionarFoto.contains("x") || acionarFoto.contains("X")){

                System.out.println(linha);
                System.out.println("Nenhuma foto foi tirada");
                System.out.println("Carga atual: "+this.carga);
                System.out.println(linha);

            }else{

                System.out.println(linha);
                System.out.println("!! Comando inválido !!");
                System.out.println(linha);
                System.exit(1);

            }
        }


    }



    void bateria(){

        System.out.println("Bateria do robo: "+this.carga);

    }

    void andou(){

        if(this.carga <= 10){

            this.carregar();

            this.descarregar();

        }else{

            this.descarregar();
          
        }

    }

    void girou(){

        if(this.carga <= 10){

            this.carregar();

            this.descarregarRotacao();

        }else{

            this.descarregarRotacao();
          
        }

    }

    void fotografou(){

        if(this.carga <= 10){

            this.carregar();

            this.descarregarFoto();

        }else{

            this.descarregarFoto();
          
        }

    }



    void carregar(){

        this.carga = 100;

    }

    void descarregar(){

        int refreshCarga = this.carga - this.descarga;

        this.carga = refreshCarga;
            
        System.out.println("Carga atual: "+this.carga);

    }

    void descarregarRotacao(){

        /*System.out.println("Carga inicial: "+this.carga);*/

        int refreshCargaRotaciona = this.carga - this.descargaRotaciona;

        this.carga = refreshCargaRotaciona;
            
        System.out.println("Carga atual: "+this.carga);
        System.out.println(linha); System.out.println();

    }

    void descarregarFoto(){

        /*System.out.println("Carga inicial: "+this.carga);*/

        int refreshCargaFoto = this.carga - this.descargaFoto;

        this.carga = refreshCargaFoto;
            
        System.out.println("Carga atual: "+this.carga);
        System.out.println(linha); System.out.println();

    }

    
}
