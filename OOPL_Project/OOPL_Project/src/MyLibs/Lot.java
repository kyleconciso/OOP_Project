/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Art
 */
public class Lot {
    public int BlockNum;
    public int LotNum;
    public int Size;
    public int Price;
    public Boolean Availability;

    public Lot(int BlockNum, int LotNum, int Size, int Price, Boolean Availability) {
        this.BlockNum = BlockNum;
        this.LotNum = LotNum;
        this.Size = Size;
        this.Price = Price;
        this.Availability = Availability;
    }
}
