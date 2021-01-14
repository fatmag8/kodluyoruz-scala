package dev.akif.kodluyoruz.streetfinder
import java.io.File
import dev.akif.kodluyoruz.streetfinder.CsvLoaderImp.loadCsv
import dev.akif.kodluyoruz.streetfinder.StreetFinderImp.findStreets

/**
 * See CSV file at: https://github.com/makiftutuncu/kodluyoruz-scala/blob/main/data/streets.csv
 *
 * Original data: https://github.com/life/il-ilce-mahalle-sokak-cadde-sql
 */
object Application {
  def main(args: Array[String]): Unit = {
    val file_Object = new File("data/streets.csv" )
    val listOfSkTitle:List[String]=loadCsv(file_Object)
    val searchNames = Set( "AVRUPA")
    ///searchNames--->scala.io.StdIn.readLine() can get from the user
   print(findStreets(listOfSkTitle,searchNames))

  }
}
