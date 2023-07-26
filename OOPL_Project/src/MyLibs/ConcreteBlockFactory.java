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
public class ConcreteBlockFactory extends IBlockFactory{
    private Block block;

    @Override
    public Block createBlocks(int request) {
        switch(request){
            case 1:
                block = new Block1();
        }
        return block;
    }
}
