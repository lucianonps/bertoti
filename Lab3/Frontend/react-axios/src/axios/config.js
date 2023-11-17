import axios from "axios";

const carroFetch = axios.create({
  baseURL: "http://localhost:8080",
  headers: {
    "Content-Type": "application/json",
  },
});
  (error) => {
    return Promise.reject(error);
  }

export default carroFetch;