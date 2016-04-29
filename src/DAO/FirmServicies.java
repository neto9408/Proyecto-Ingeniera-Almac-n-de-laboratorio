
package DAO;


public class FirmServicies {
    
  public String desencriptar(string texto){
      String  resultado="";
      for (int i = 0; i < texto.length(); i++) {
          int letra= (((int)texto.charAt(i))-3);
          if(letra < 65){
              letra +=26;
          }
          resutado+=(char)letra;
      }
      return resultado;
  }  
}
