import React, { useContext, useState, useEffect} from "react";
import axios from 'axios';



const Trades= ()=>{

  const [trade, setTrade]= useState([{}]);

  const url= "";

  useEffect(() => {
    axios.get(url).then((res)=>{
      if(res.data){
        console.log(res.data);
        setTrade(res.data);
  
      }
    });
  
  }, [trade]);

    return (
        <div class="flex flex-col">
  <div class="overflow-x-auto sm:-mx-6 lg:-mx-8">
    <div class="py-2 inline-block min-w-full sm:px-6 lg:px-8">
      <div class="overflow-hidden">
        <table class="min-w-full">
          <thead class="border-b">
            <tr>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre ">
                Id
              </th>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                BookId
              </th>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                CounterPartyId
              </th>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                SecurityId
              </th>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                Quantity
              </th>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                Status
              </th>
              <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-centre">
                Price
              </th>
            </tr>
          </thead>
          <tbody>
          {/* <button> */}
            <tr class="border-b">
              <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">1</td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                M
              </td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                O
              </td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                @
              </td>
            </tr>
            {/* </button> */}
            <tr class="bg-white border-b">
              <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">2</td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                J
              </td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                T
              </td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                @f
              </td>
            </tr>
            <tr class="bg-white border-b">
              <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">3</td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                L
              </td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                W
              </td>
              <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                @t
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>
    )
}

export default Trades;