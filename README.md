# CaesarCipherKata

A code kata based on the Caesar cipher


## The Caesar cipher

The Caesar cipher, as a shift cipher, is one of the simplest forms of encryption. It is a substitution cipher where each letter in the original message is replaced with a letter some fixed number of positions up or down in the alphabet.

For example, with a left shift of 3, D would be replaced by A, E would become B, and so on. Note that the letters 'wrap around' when you reach the end of the alphabet, so C would map to Z for instance.

![Left shift 3](https://upload.wikimedia.org/wikipedia/commons/4/4a/Caesar_cipher_left_shift_of_3.svg)


## The kata

The task for the kata is to implement 3 functions, as outlined in the pseudocode example below:

```
// Take a plaintext string and apply the cipher using the given shift value.
encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23) -> "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"

// Take a ciphertext string and decrypt it using the given shift value.
decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23) -> "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"

// Take a ciphertext string and attempt to find the shift value used to encrypt it.
crack("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD") -> 23
```

A positive shift value indicates a right shift, and a negative value indicates a left shift. The `crack` function should always return the value as a right shift.


## Resources

* A simple word list file is provided, named `wordlist.txt`. You may find it useful when implementing the `crack` function!
* The [Wikipedia page](https://en.wikipedia.org/wiki/Caesar_cipher) has further information which you may find useful.


## Optional extras

Depending on your initial approach, the kata itself may be quite straightforward. If you like, here are some ideas for requirements you could add to increase or extend the challenge:

* Handle both uppercase and lowercase letters.
* Crack ciphertexts which include one or more words *not* found in the word list. e.g. "BRIGHTHR".
* Crack ciphertexts where the words are not separated by spaces.
