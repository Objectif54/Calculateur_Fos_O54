/*package com.obj54.Calcul;

public class Calcul{
    
    public Integer calcNorm() {
        Integer valueZC = 0;
        double coefSectAct = 0;
        Integer surface = 200;
        Integer result = 0;

        if (ZC.nameClim == "H1") {
            valueZC = 2600;
        } else if (ZC.nameClim == "H2"){
            valueZC = 2100;
        } else if (ZC.nameClim == "H3"){
            valueZC = 1400;
        }

        if (SectAct.nameSecteur == "Bureaux, Enseignement, Commerces") {
            coefSectAct = 0.6;
        } else if (SectAct.nameSecteur == "Hotellerie-Restauration"){
            coefSectAct = 0.7;
        } else if (SectAct.nameSecteur == "Sante"){
            coefSectAct = 1.2;
        } else if (SectAct.nameSecteur == "Autres secteurs"){
            coefSectAct = 0.6;
        }

        result = (int) (valueZC * coefSectAct * surface);

        return result;

    }

}*/