package dev.akif.kodluyoruz.streetfinder
import java.io.File

object CsvLoaderImp extends CsvLoader {
  override def loadCsv(file: File): List[String] ={
    val bufferedSource = io.Source.fromFile(file)
    var namesList :   List[String] = {
      bufferedSource.getLines()
        .map(_.split(",")
          .map(_.trim).apply(1)).toList

    }
    bufferedSource.close
    namesList
  }
}
