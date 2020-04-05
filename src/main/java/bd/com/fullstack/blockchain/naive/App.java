package bd.com.fullstack.blockchain.naive;

public class App {

    public static void main(String[] args) {

        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();

        Block block0 = new Block(0,"tx1", Constants.GENESIS_PREV_HASH);
        miner.mine(block0, blockChain);

        Block block1 = new Block(1,"tx2", blockChain.getChain().get(blockChain.size() - 1).getHash());
        miner.mine(block1, blockChain);

        Block block2 = new Block(2,"tx3", blockChain.getChain().get(blockChain.size() - 1).getHash());
        miner.mine(block2, blockChain);

        System.out.println("\n"
                + "The Final Chain: \n " + blockChain);
        System.out.println("Miner's reward: " + miner.getReward());

    }
}
