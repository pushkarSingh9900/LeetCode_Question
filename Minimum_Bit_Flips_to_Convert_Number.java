class Solution {
    public int minBitFlips(int start, int goal) {
        int xorRes = start ^ goal; // xor operation
        return Integer.bitCount(xorRes);
    }
}