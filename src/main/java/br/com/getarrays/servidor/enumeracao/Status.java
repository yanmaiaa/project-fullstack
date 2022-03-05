package br.com.getarrays.servidor.enumeracao;

public enum Status {

    SERVIDOR_ON("SERVIDOR_ON"),
    SERVIDOR_OFF("SERVIDOR_OFF");

    private final String status;

    Status(String status){
       this.status =  status;
    }

    public String getStatus(){
        return this.status;
    }
}
