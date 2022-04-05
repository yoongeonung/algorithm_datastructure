//package chap3;
//
//public class SideEffects {
//
//    private Cryprographer cryprographer;
//    // 부수 효과를 일으키는 안좋은 함수
//    public boolean checkPassword(String userName, String password) {
//        User user = UserGateway.findByName(userName);
//        if (user != User.NULL){
//            String codedPhrase = user.getPhraseEncodedByPassword();
//            String phrase = cryptographer.decrypt(codedPhrase, password);
//            if ("Valid Password".equals(phrase)) {
//                Session.initialize();
//                return true;
//            }
//        }
//        return false;
//    }
//}
