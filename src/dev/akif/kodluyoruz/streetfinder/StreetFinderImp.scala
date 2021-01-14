package dev.akif.kodluyoruz.streetfinder


object StreetFinderImp extends StreetFinder{
  def findStreets(streets: List[String], names: Set[String]): List[String]={
    var result:List[String]=List()
    for (street <- streets ){
      for(name<-names){
        if(street.contains(name) && !result.contains(street) ){
            result=result:+street
        }
      }

    }
    result
  }
}
