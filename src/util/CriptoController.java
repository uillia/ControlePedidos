package util;

import org.apache.commons.codec.binary.Base64;

public class CriptoController {

    /**
     * Codifica string na base 64 (Encoder)
     * @param msg
     * @return 
     */
    public String encryptBase64encoder(String msg) {
        return new Base64().encodeToString(msg.getBytes());
    }

    /**
     * Decodifica string na base 64 (Decoder)
     * @param msg
     * @return 
     */
    public String decryptBase64Decoder(String msg) {
        return new String(new Base64().decode(msg));
    }

}
