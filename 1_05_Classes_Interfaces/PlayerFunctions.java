class PlayerFunctions {

  static void clearName( PlayerData data ) {
    data.name = "";
  }

  static boolean hasCompoundName( PlayerData data ) {
    return (data.name == null) ? false : data.name.contains( " " );
  }
}
