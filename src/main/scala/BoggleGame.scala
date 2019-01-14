/*


object BoggleGame {
  def main(args: Array[String]) {
    // Let the given dictionary be following
    val dictionary = List("GEEKS", "FOR", "QUIZ", "GO")

    var matrix = Array.ofDim[Char](3,3)

    matrix = Array(Array('G','I','Z'), Array('U','E','K'), Array('Q','S','E'))


  }


  // A recursive function to print all words present on boggle
  def findWordsUtil(list: List, visited: Boolean , Int: i,  Int: j, String: s) ={

  }

  def findWordsUtil(char boggle[M][N], bool visited[M][N], int i,  int j, string &str) =
  {
    // Mark current cell as visited and append current character
    // to str
    visited[i][j] = true;
    str = str + boggle[i][j];

    // If str is present in dictionary, then print it
    if (isWord(str))
      cout << str << endl;

    // Traverse 8 adjacent cells of boggle[i][j]
    for (int row=i-1; row<=i+1 && row<M; row++)
    for (int col=j-1; col<=j+1 && col<N; col++)
    if (row>=0 && col>=0 && !visited[row][col])
      findWordsUtil(boggle,visited, row, col, str);

    // Erase current character from string and mark visited
    // of current cell as false
    str.erase(str.length()-1);
    visited[i][j] = false;
  }
}*/
