package Dao;
import Domain.Bean;
import java.util.*;
import java.text.*;
import java.io.*;

public class Dao {
    public Dao(File input) {
        this.content = this.loadFile(input);
    }
    private List<Bean> content;

    public List<Bean> getContent() {
        return content;
    }

    public void setContent(List<Bean> content) {
        this.content = content;
    }

    private List<Bean> loadFile(File input){ //包含了一组特定类型的对象
        if (input == null){
            return null;
        }
        List data = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader("src/main/java/LilyPalais.xlsx - Value.csv"))) {
            String line;
            while ((line = in.readLine()) != null){ //当从文件中成功读取一行数据，并且这行数据不为 null 时，继续执行循环
                data.add(line);
                Bean bean = this.parseString(line);
                data.add(bean);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    private Bean parseString(String line) throws ParseException {
        if(line != null){
            String[] arrayData = line.split(","); //字符串数组
            if (arrayData != null && arrayData.length == 16){
                Integer id = Integer.parseInt(arrayData[0]);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date dob = sdf.parse(arrayData[4]);
                Integer gender = Integer.parseInt(arrayData[6]);
                Integer heightCm = Integer.parseInt(arrayData[9]);
                Integer weightKg = Integer.parseInt(arrayData[10]);

                Bean bean = new Bean();
                bean.setId(id);
                bean.setCodeName(arrayData[1]);
                bean.setNameOriginal(arrayData[2]);
                bean.setRace(arrayData[3]);
                bean.setDob(dob);
                bean.setAttribute(arrayData[5]);
                bean.setGender(gender);
                bean.setAssSize(arrayData[7]);
                bean.setBoobsSize(arrayData[8]);
                bean.setHeightCm(heightCm);
                bean.setWeightKg(weightKg);
                bean.setCommand(arrayData[11]);
                bean.setGroup(arrayData[12]);
                bean.setProfession(arrayData[13]);
                bean.setCombat(arrayData[14]);
                bean.setFavoriteFoods(arrayData[15]);
//                System.out.println(bean);
                return bean;
            }
        }
        return null;
    }
//    public static String convertListToJson(List<Bean> beans) {
//        Gson gson = new Gson();
//        return gson.toJson(beans);
//    }

}
