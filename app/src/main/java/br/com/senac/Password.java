package br.com.senac;

import java.util.Random;

public class Password {
    private String phrase;
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if(place.length()>0)
            this.place = phrase;
        else
            this.place = "lugar";
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        if(phrase.length()>0)
            this.phrase = phrase;
        else
            this.phrase = "Usuario nao forneceu senha";
    }

    public Password(String phrase, String place) {
        if(place.length()>0)
            this.place = place;
        else
            this.place = "lugar";
        if(phrase.length()>0)
            this.phrase = phrase;
        else
            this.phrase = "Usuario nao forneceu senha";
    }

    private int randomNumber(int max){
        int min = 1;
        return (int)(Math.random()*(max-min+1)+min);
    }

    private char pickChar(String word){
        int randomNumber = this.randomNumber(word.length());
        return word.charAt(word.length() % randomNumber );
    }

    /**
     * Os caracteres colocados aqui sao apenas um exemplo
     * @param passPhase1
     * @return
     */
    private String changeChar(String passPhase1){
        String passPhase2 = "";
        for(int i=0; i<passPhase1.length(); i++){
            switch(passPhase1.charAt(i)){
                case 'a': passPhase2 += '@'; break;
                case 'h': passPhase2 += '4'; break;
                case 's': passPhase2 += '5'; break;
                case 'o': passPhase2 += '0'; break;
                case 'r': passPhase2 += '3'; break;
                default: passPhase2 += passPhase1.charAt(i);
            }
        }
        System.out.println(passPhase2);
        return passPhase2;
    }

    private String kernel(){
        String phraseArray[] = this.phrase.split(" ");
        String passPhase1 = "", passPhase2;
        for(int i=0; i<phraseArray.length; i++){
            System.out.println(passPhase1);
            passPhase1 += pickChar(phraseArray[i]);
            if(Math.floor(phraseArray.length/2) == i)
                passPhase1 += this.place;
            System.out.println(passPhase1);
        }
        passPhase2 = changeChar(passPhase1);
        return passPhase2;
    }

    public String myPass(){
        return kernel();
    }
}
