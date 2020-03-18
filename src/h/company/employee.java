package h.company;
public class employee {
 private String name;
 private int idNumber;
 private String department;
 private String position;
 
 
 public employee(){
     name = "";
     idNumber = 0;
     department = "";
     position = "";
//     System.out.println("no data");
 }
 public employee(String n,int id){
     name = n;
     idNumber = id;
     department = "";
     position = "";
//     System.out.println( idNumber+": "+ name +" With out(Department, Position) ");
 }
 public employee(String n,int id,String dprt,String psn){
     name = n;
     idNumber = id;
     department = dprt;
     position = psn;
     
     
 }
 
 
 // gets
 public String getName(){
     return name;
 }
 public int getId(){
     return idNumber;
 }
 public String getDprt(){
     return department;
 }
 public String getpsn(){
     return position;
 }

 
 // set
 public void setName(String n){
      name = n;
 }
 
 public void setId(int id){
      idNumber = id;
 }
 
 public void setDprt(String dprt){
      department = dprt;
 }
 public void setPsn(String psn){
     position = psn;
 }

 
 
 
}

