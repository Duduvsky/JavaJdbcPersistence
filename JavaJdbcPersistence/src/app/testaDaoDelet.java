package app;

import dao.ContactDao;

import java.sql.SQLException;

public class testaDaoDelet {
    public static void main(String[] args) {

        try {
            ContactDao dao = new ContactDao();
            dao.removeContact((long) 3);
            System.out.println("Deletou no Banco de Dados!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
