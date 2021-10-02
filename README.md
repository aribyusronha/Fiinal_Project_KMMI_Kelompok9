# Final_Project_KMMI_Kelompok9

Nama Anggota Kelompok :
- Arib Yusron Hamdani 2017051078
- Rosmawati
- Wina Fadhilah 2017051056

# About this project:

Sistem yang dapat digunakan untuk merekam transaksi data nasabah di bank, dimana terdapat 2 jenis nasabah yaitu individu dan perusahaan. Setiap nasabah dapat memiliki 1 atau lebih rekening.

Libraries and Tools of this project:

- sqlite-jdbc-3.36.0.3.jar
- scene builder
- sqlite studio
- netbeans editor
- Java 1.8 JDK

# Kelompok 9's work divisions:

Arib Yusron Hamdani Handle:
- FinalFXLMController.java
- NasabahDataModel.java
- DBHelper

Wina Fadhilah Handle:
- GUI FXML
- Sqlite
- Nasabah.java

Rosmawati Handle:
- Individu.java
- Main.java
- Perusahaan.Java
- Rekening.java

# Design
- Class Diagram
```
classDiagram
    Nasabah <|-- Individu
    Nasabah <|-- Perusahaan
    Nasabah "1"--o"*" Rekening : has
          

    class Nasabah{
      <<abstract>>
      #Integer id_nasabah
      #String nama
      #String alamat
      #Integer numRek
      
      +Integer nextID()
    }
    
    class Individu{
      -Long nik
      -Long npwp
    }
    class Perusahaan{
      -String nib
    }
    class Rekening{
      -Integer noRekening
      -Double saldo
      +tambah saldo(double jumlah)
      +tarik tunai(double jumlah)
      +double getSaldo()
    }
```
-   ![mermaid-diagram-20211002123520](https://user-images.githubusercontent.com/83532253/135705343-642131e2-c681-4669-a812-d28bb7b5ecec.png)
- ER Diagram
- ![er diagram](https://user-images.githubusercontent.com/83532253/135705908-6f700459-4bea-42cd-84d4-c75c83cf25af.png)
- Class Diagram for JavaFX and Database
```
 classDiagram
    Nasabah <|-- Individu
    Nasabah <|-- Perusahaan
    Nasabah "1"--o"*" Rekening : has
    Nasabah o-- NasabahDataModel : Data Modeling
    NasabahDataModel <-- FinalFXLMController : Data Control
    NasabahDataModel --> DBHelper : DB Connection
    FinalFXLMController <.. FormNasabah : Form Control      

    class Nasabah{
      <<abstract>>
      #IntegerProperty id_nasabah
      #StringProperty nama
      #StringProperty alamat
      #IntegerProperty numRek
      
      +IntegerProperty nextID()
    }
    
    class Individu{
      -LongProperty nik
      -LongProperty npwp
    }
    class Perusahaan{
      -StringProperty nib
    }
    class Rekening{
      -IntegerProperty noRekening
      -DoubleProperty saldo
      +tambah saldo(double jumlah)
      +tarik tunai(double jumlah)
      +double getSaldo()
    }

    class NasabahDataModel{
        Connection conn
        NasabahDataModel()
        tambahNasabah(Individu individu)
        tambahNasabah(Perusahaan perusahaan)
        getIndividu()
        getPerusahaan()
        getRekening (int id_nasabah)
        nextId_nasabah_I(int id_nasabah)
        nextId_nasabah_P(int id_nasabah)
        nextNo_rekening(int id_nasabah)
        tambahRekening(int id_nasabah,Rekening rek)
    
    }

    class FinalFXLMController{
        initialize()
        handleRefreshBtn_I(ActionEvent event)
        handleRefreshBtn_P(ActionEvent event)
        handleTambahNasabahBtn_I(ActionEvent event)
        handleTambahNasabahBtn_P(ActionEvent event)
        handleTambahRekeningBtn_I(ActionEvent event)
        handleTambahRekeningBtn_P(ActionEvent event)
        handleTambahSaldoBtn_I(ActionEvent event)
        handleTambahSaldoBtn_P(ActionEvent event)
        handleTarikTunaiBtn_I(ActionEvent event)
        handleTarikTunaiBtn_P(ActionEvent event)
        initialize(URL url, ResourceBundle rb)
        viewRekening_I(int id_nasabah)
        viewRekening_P(int id_nasabah)
    }
    class DBHelper{
        - String CONN
        getConnection()
        createTable();
    }
```
-   ![mermaid-diagram-20211002121933](https://user-images.githubusercontent.com/83532253/135705366-b2801a9b-46fe-427e-bdc0-ec09cd511260.png)

  

