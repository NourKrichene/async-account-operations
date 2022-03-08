import React from "react";

const Operation = ({ operation }) => {
  return (
    <li className="text-xl font-bold">
      {operation.label}, {operation.amount}, {operation.executionDate}
    </li>
  );
};

export default Operation;