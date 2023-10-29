package Test;
import Dao.Dao;
import Domain.Bean;
import java.io.File;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        File input = new File("src/main/java/LilyPalais.xlsx - Value.csv");
        Dao dao = new Dao(input);
        List<Bean> bean = dao.getContent();
        System.out.println(bean);
    }
}
