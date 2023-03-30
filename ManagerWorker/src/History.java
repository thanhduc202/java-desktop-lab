
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thanh
 */
public class History extends Worker implements Comparable<History>{
    private String status;
    private String date;
    
    public History() {
    }
    
    public History(String status, String date, String id, String name, int age,
            int salary, String workLocation) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public int compareTo(History t) {
        return this.getDate().compareTo(t.getDate());
    }

    
}
