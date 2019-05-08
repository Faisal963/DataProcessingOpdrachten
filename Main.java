package inleveropdracht1;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException , ParseException {
        Reiziger reiziger1 = new Reiziger("Johan", java.sql.Date.valueOf("1985-12-23"));
        Reiziger reiziger2 = new Reiziger("Meike", java.sql.Date.valueOf("1990-06-16"));
        Reiziger reizigerupdate = new Reiziger("Max", java.sql.Date.valueOf("1990-07-17"));

        ReizigerOracleDaoImpl imp;
        imp = new ReizigerOracleDaoImpl() {
            @Override
            public List<Reiziger> findAll() {
                return null;
            }

            @Override
            public List<Reiziger> findByGBdatum(String GBdatum) {
                return null;
            }
        };

        imp.save(reiziger1);
        imp.save(reiziger2);
        System.out.println("Rezigers list bestaat uit de volgende reizigers: " + imp);
        imp.findByGBdatum((Date) reiziger1.getGbdatum());
        System.out.println(imp.update(reizigerupdate).getNaam() + " is updated");
        System.out.println(imp);
        System.out.println((imp.delete(reiziger1)) ? reiziger1.getNaam() + " is deleted"
                : reiziger1.getNaam() + " is not deleted");
        System.out.println(imp);

    }
}
