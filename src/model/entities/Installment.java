package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double value;

    public Installment() {
    }

    public Installment(Date dueDate, Double value) {
        this.dueDate = dueDate;
        this.value = value;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dueDate) +
                " - " + String.format("%.2f",value);
    }

    public void setValue(Double value) {
        this.value = value;


    }
}
