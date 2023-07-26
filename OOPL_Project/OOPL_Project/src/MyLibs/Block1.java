/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author Art
 */
public class Block1 implements Block{
    @Override
    public ArrayList LotList(){
        ArrayList<Lot> LotList = new ArrayList<Lot>();
        Lot Lot1 = new Lot(1,1, 200, 14000, true);
        LotList.add(Lot1);
        Lot Lot2 = new Lot(1,2, 200, 14000, true);
        LotList.add(Lot2);
        
        return LotList;
    }
}
