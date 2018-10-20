package com.tong.art.facade;

/**
 * @Description: 加密外觀類：外觀類
 * @Create: 2018/10/20 0020 上午 9:40
 */
public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade(){
        this.reader = new FileReader();
        this.cipher = new CipherMachine();
        this.writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
