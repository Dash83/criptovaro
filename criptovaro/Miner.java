package criptovaro;

public class Miner {
    private CriptoVNetwork nm;
    private boolean initialized;
    private Account currentAccount;
    private BlockChain bchain;
    private TransactionManager tm;
    private PeerManager pm;
    private TransactionPool pool;
    private Peer[] peerCache;
    private boolean interruptWork;

    private Miner() {
        /*
         * 
         */
    }


    private void startTCPListener(int port, Miner owningMiner, TransactionPool pool) {
    }

    private void Update() {
    }

    public synchronized void toggleWork() {
    }

    private Transaction createPrizeTransaction() {
        return null;
    }

    private void Work() {
    }

    private static void main(String[] argv) {
    }

    public void start() {
    }

    public void stop() {
    }
}