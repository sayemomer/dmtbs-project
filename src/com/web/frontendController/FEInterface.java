package com.web.frontendController;


import FrontEnd.MyRequest;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface FEInterface {
    void informRmHasBug(int RmNumber);

    void informRmIsDown(int RmNumber);

    int sendRequestToSequencer(MyRequest myRequest);

    void retryRequest(MyRequest myRequest);


    public String addMovie(String managerID ,String movieID, String movieType, int bookingCapacity);

    public String removeMovie( String managerID , String movieID, String movieType);

    public String listMovieAvailability( String managerID,String movieType);



    public String bookMovie(String customerID, String movieID, String movieType);

    public String getBookingSchedule(String customerID);

    public String cancelMovie(String customerID, String movieID, String movieType);

    public String swapMovie(String customerID, String newMovieID, String newMovieType, String oldMovieID, String oldMovieType);
}