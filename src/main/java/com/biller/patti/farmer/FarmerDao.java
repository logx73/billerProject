package com.biller.patti.farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FarmerDao {
//    private DataSource dataSource;

    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    FarmerRepository farmerRepository;

//    @Autowired
//    public FarmerDao(DataSource dataSource){
//        this.dataSource = dataSource;
//    }

    @Autowired
    public FarmerDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public int insertDataInFarmerJDBC(){
//        try{
//            Connection con = dataSource.getConnection();
//            PreparedStatement stmt = con.prepareStatement("INSERT INTO farmer VALUES (?,?,?,?,?)");
//            stmt.setLong(1,1001);
//            stmt.setString(2,"PUNE");
//            stmt.setString(3,"lok@gmail.com");
//            stmt.setString(4,"12345678");
//            stmt.setString(5,"LOKESH");
//            return stmt.executeUpdate();
//        } catch (Exception sqlException){
//            System.out.println(sqlException.getMessage());
//        }
//        return 0;
//    }

    public void insertDataInFarmerTemplate(){
        String sql = "INSERT INTO farmer VALUES (:id,:add,:mail,:phNo,:nme)";
        Map<String, Object> params= new HashMap<>();
        params.put("id",1002);
        params.put("add","PUNE");
        params.put("mail","lok@gmail.com");
        params.put("phNo","123456");
        params.put("nme","Lokesh");
        jdbcTemplate.update(sql, new MapSqlParameterSource(params));
    }

    public Farmer saveFarmer(Farmer farmer){
        try{
            Farmer farmer1 = farmerRepository.save(farmer);
            return farmer1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public List<Farmer> getFarmerByLastName(String lastName){
        try{
            List<Farmer> farmer=farmerRepository.findByLastName(lastName);
            return farmer;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public List<Farmer> getFarmerByFirstName(String name){
        try{
            List<Farmer> farmer=farmerRepository.findByFirstName(name);
            return farmer;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public Farmer getFarmerById(Long id){
        try{
            Farmer farmer=farmerRepository.findByFarmerId(id);
            return farmer;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public List<Farmer> getFarmer() {
        try{
            List<Farmer> farmerList = farmerRepository.findAll();
            return farmerList;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public List<Farmer> getFarmerByParam(String keyword){
        try{
            List<Farmer> farmerList = farmerRepository.findByKeyword(keyword);
            return farmerList;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
