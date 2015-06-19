package models;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Service implements Serializable {  
    
    private int id;
    private Double price;
    private String value;
    
    public Service() {
        //
    }

    public Service(int id, String value, Double price) {
        this.id = id;
        this.value = value;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }    

    @Override
    public String toString() {
        DecimalFormat formatoDois = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));  
        formatoDois.setMinimumFractionDigits(2);   
        formatoDois.setParseBigDecimal (true);    
        String preco = formatoDois.format(price);

        return " R$ " + preco + " (" + value + ") ";
    }           
}
