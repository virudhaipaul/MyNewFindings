//Converting the byte array in to HexString format
      byte[] digest = "virudhaipaul".getbytes();
      StringBuffer hexString = new StringBuffer();
      
      for (int i = 0;i<digest.length;i++) {
         hexString.append(Integer.toHexString(0xFF & digest[i]));
      }
      System.out.println("Hex format : " + hexString.toString());    

// example 2:
byte[] decryptedMessage = rsaDecrypt.doFinal(encryptedMessage);

            System.out.println("Decrypted data:");
            for (int i = 0; i < decryptedMessage.length; ++i) {
                System.out.printf(" %02X", decryptedMessage[i]);
                if ((i + 1) % 8 == 0)
                    System.out.println();
            }
