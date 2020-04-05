package bd.com.fullstack.blockchain.naive;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {

    private List<Block> chain;

    public BlockChain() {
        this.chain = new ArrayList<>();
    }

    public void addBlock(Block block) {
        this.chain.add(block);
    }

    public List<Block> getChain() {
        return this.chain;
    }

    public int size() {
        return this.chain.size();
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
