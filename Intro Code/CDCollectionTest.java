
public class CDCollectionTest
{
  public static void main(String[] args)
  {
    CDCollection db = new CDCollection();


    db.addCD(new CD("Summer Teeth","Wilco",13.00,17,5));
    db.addCD(new CD("Sea of Noise","St. Paul and the Broken Bones", 10.99,20,5));
    db.addCD(new CD("Witness", "Benjamin Booker",11.49, 12,5));
    db.addCD(new CD("Strange Desire","Bleachers", 9.00,16,4));
    db.addCD(new CD("Feel your Feelings Fool!","The Regretts", 7.99,15,5));
    db.addCD(new CD("The Ride","Catfish and the Bottlemen", 9.99,11,4.5));
    db.addCD(new CD("Everybody Wants","The Struts", 11.79,13,5));
    db.addCD(new CD("Comming Home","Leon Bridges", 12.49,10,5));
    db.addCD(new CD("If'n","fIREHOSE", 10.09,14,5));
    db.addCD(new CD("Let it Be","The Replacements", 8.99,16,5));
    db.addCD(new CD("A Positive Rage","The Hold Steady", 10.49,16,4.5));
    db.addCD(new CD("Let the Record Play","Moon Taxi", 1.99,10,2.5));
    db.addCD(new CD("Rainbow","Kesha", 7.19,10,1.5));
    db.addCD(new CD("Songs about Jane","Maroon 5", 5.99,10,.5));
    db.addCD(new CD("Nervous System","Julia Michaels", 6.99,7,1.5));


	//displays the entire list of CD's "Artist"--"CD"--"Number of Tracks"
	// use printf to format output, does not return a string like toString
    db.print();

    System.out.println(db.cheapest(5));
    System.out.println(db.cheapest(4));



    System.out.println(db.choices(1.99, 7.99, 1));
    System.out.println(db.choices(7.00, 10.99, 4.5));


  }
}

