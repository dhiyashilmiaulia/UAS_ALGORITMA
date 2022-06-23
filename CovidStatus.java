package Model;

public class CovidStatus {
    private String id;
    private String rank;
    private String country;
    private String countient;
    private String twolattersymbol;

    public CovidStatus(String id,String rank,String country,String countient,String twolattersymbol){
        this.id= id;
        this.rank=rank;
        this.country=country;
        this.countient=countient;
        this.twolattersymbol=twolattersymbol;
    }
        public class printcovidStatus{public void printCovidStatus(){
            System.out.println("id:"+"rank :");
        }
    }
}
