import java.io.IOException;
import java.util.HashMap;

import data.Data;
import data.DataException;
import view.WriteFile;


public class Main {
    public static void main(String[] args) {
        Data parsData = new Data(); 
        
        String newFileName = null; 
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
       for (String str : data.keySet()) {
        sb.append(data.get("lastName"));
        sb.append(" ");
        sb.append(data.get("firstName"));
        sb.append(" ");
        sb.append(data.get("patronymic"));
        sb.append(" ");
        sb.append(data.get("date"));
        sb.append(" ");
        sb.append(data.get("tel"));
        sb.append(" ");
        sb.append(data.get("gender"));
        sb.append(" ");

       }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); // Вызывается метод класса WriteFile для записи в файл

    }
}