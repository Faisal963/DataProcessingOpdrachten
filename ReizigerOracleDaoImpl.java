package inleveropdracht1;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public abstract class ReizigerOracleDaoImpl extends OracleBaseDao  implements ReizigerDao  {

    private ArrayList<Reiziger> reizigers;

    public ReizigerOracleDaoImpl() {
        reizigers = new ArrayList<Reiziger>();
    }

    public ArrayList<Reiziger> findall() {
        return reizigers;
    }

    public ArrayList<Reiziger> findByGBdatum(Date gbdm) {
        ArrayList<Reiziger> gevonden = null;
        for (Reiziger reiziger : reizigers) {
            if (reiziger.getGbdatum().equals(gbdm)) {
                System.out
                        .println("Gevonden: " + reiziger.getNaam() + " is geboren op " + reiziger.getGbdatum() + "\n");
                gevonden = reizigers;
            }
        }
        return gevonden;
    }

    public Reiziger save(Reiziger reiziger) {
        Reiziger savereiziger = null;
        if (reizigers.add(reiziger)) {
            savereiziger = reiziger;
        }
        return savereiziger;
    }

    public Reiziger update(Reiziger reiziger) {
        Reiziger updatedreiziger = null;

        for (Reiziger r : reizigers) {
            if (r.getNaam().equals(reiziger.getNaam())) {
                r.setGbdatum(reiziger.getGbdatum());
                updatedreiziger = reiziger;
            }
        }
        return updatedreiziger;
    }

    public boolean delete(Reiziger reiziger) {
        return reizigers.remove(reiziger);
    }

    public String toString() {
        String s = "Rezigers list bestaat uit de volgende reizigers: \n";
        for (Reiziger r : reizigers) {
            s += r.getNaam() + " is geboren op " + r.getGbdatum() + "\n";
        }
        return s;
    }

}
