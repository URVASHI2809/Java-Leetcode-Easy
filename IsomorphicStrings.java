public class IsomorphicStrings {
     public boolean isIsomorphic(String s, String t) {
         if (s.length() != t.length()) {
             return false;
         }
         int[] sMap = new int[256];
         int[] tMap = new int[256];
         for (int i = 0; i < s.length(); i++) {
             char sChar = s.charAt(i);
             char tChar = t.charAt(i);
             if (sMap[sChar] != tMap[tChar]) {
                 return false;
             }
             sMap[sChar] = i + 1;
             tMap[tChar] = i + 1;
         }
         return true;
     }
     public static void main(String[] args) {
         IsoMorphic isoMorphic = new IsoMorphic();
         String s = "egg";
         String t = "add";
         boolean result = isoMorphic.isIsomorphic(s, t);
         System.out.println(result);
     }
}
