import axios from 'axios';
import React, { useState, useEffect } from "react";
// import { useHistory } from "react-router-dom";
// import { useNavigate } from "react-router-dom";

const url = 'https://db-grads-39ch-group-21.nw.r.appspot.com';
const Securities = () => {

  const [security, setSecurities] = useState([{}]);

  useEffect(() => {
    axios.get(`${url}/security/all`).then((res) => {
      if (res.data) {
        console.log(res.data);
        console.log("ily");

        setSecurities(res.data);
      }
    })
  }, []);

  const handlerFunction = (e) => {

    // const history = useHistory();
  
    
      let path = `${url}/getTradesFromSecurity/${security[e].id}`; 
      window.location.href= path;

      // history.push(path);
    // console.log(e);
    console.log(security[e]);
    // let navigate = useNavigate();
    // const routeChange = () => {
    //   let path = ``;
    //   navigate(path);
    }

    return (
      <div className="flex flex-col">
        <div className="overflow-x-auto sm:-mx-6 lg:-mx-8">
          <div className="py-2 inline-block min-w-full sm:px-6 lg:px-8">
            <div className="overflow-hidden">
              <table className="min-w-full">
                <thead className="border-b">
                  <tr>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre ">
                      Id
                    </th>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                      type
                    </th>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                      status
                    </th>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                      faceValue
                    </th>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                      MaturityDate
                    </th>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                      coupon
                    </th>
                    <th scope="col" className="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                      cusip
                    </th>
                  </tr>
                </thead>
                <tbody>

                  {security.map((obj, ind) => {
                    {/* <button>  */ }
                    return (
                      <tr className="border-b">
                      <button onClick={ (e)=>handlerFunction(ind)} >
                        <td className="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900 "  >{obj.id}</td>
                        </button>
                        <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                          {obj.type}
                        </td>
                        <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                          {obj.status}
                        </td>
                        <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                          {obj.faceValue}
                        </td>
                        <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                          {obj.maturityDate}
                        </td>
                        <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                          {obj.coupon}
                        </td>
                        <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                          {obj.cusip}
                        </td>
                      </tr>
                    )
                  })}


                  {/* <tr className="border-b">
                    <td className="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">1</td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      M
                    </td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      O
                    </td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      @
                    </td>
                  </tr>
                  <tr className="bg-white border-b">
                    <td className="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">2</td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      J
                    </td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      T
                    </td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      @f
                    </td>
                  </tr>
                  <tr className="bg-white border-b">
                    <td className="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">3</td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      L
                    </td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      W
                    </td>
                    <td className="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                      @t
                    </td>
                  </tr> */}
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    )
  }


export default Securities;