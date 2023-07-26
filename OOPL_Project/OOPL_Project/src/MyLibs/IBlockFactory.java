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
public abstract class IBlockFactory {
    protected abstract Block createBlocks(int request);
   
    public Block doSomething(int request) {
        Block block = createBlocks(request);
        return block;
    }
}
