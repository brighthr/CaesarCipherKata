package kata;

public interface CaesarCipherTools {

    /**
     * Take a plaintext string and apply the cipher using the given shift value.
     *
     * @param plainText e.g. "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
     * @param shift e.g. 23
     * @return e.g. "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"
     */
    String encrypt(String plainText, int shift);

    /**
     * Take a ciphertext string and decrypt it using the given shift value.
     *
     * @param cipherText e.g. "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"
     * @param shift e.g. 23
     * @return e.g. "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
     */
    String decrypt(String cipherText, int shift);

    /**
     * Take a ciphertext string and attempt to find the shift value used to encrypt it.
     *
     * @param cipherText e.g. "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"
     * @return e.g. 23
     */
    int crack(String cipherText);

}
